package io.izzel.amber.mmo.profession.data;

import org.spongepowered.api.data.DataContainer;
import org.spongepowered.api.data.DataQuery;
import org.spongepowered.api.data.DataSerializable;
import org.spongepowered.api.data.Queries;
import org.spongepowered.api.util.annotation.NonnullByDefault;

@NonnullByDefault
public class MutableProfession implements DataSerializable {

    private static final DataQuery ID = DataQuery.of("Id");
    private static final DataQuery EXPERIENCE = DataQuery.of("Experience");
    private static final DataQuery SKILL_TREE = DataQuery.of("SkillTree");

    // todo add skill tree implementation
    private final String id;
    private DataSerializable skillTree;
    private double experience;

    public MutableProfession(String id, DataSerializable skillTree, double experience) {
        this.id = id;
        this.skillTree = skillTree;
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public DataSerializable getSkillTree() {
        return skillTree;
    }

    public String getId() {
        return id;
    }

    @Override
    public int getContentVersion() {
        return 0;
    }

    @Override
    public DataContainer toContainer() {
        return DataContainer.createNew()
            .set(ID, id)
            .set(EXPERIENCE, experience)
            .set(SKILL_TREE, skillTree)
            .set(Queries.CONTENT_VERSION, this.getContentVersion());
    }

}
