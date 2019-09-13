package io.izzel.amber.mmo.skill;

import io.izzel.amber.mmo.skill.data.EntitySkill;
import lombok.Getter;

/**
 * 设计为释放的技能实体（有使用进度等）
 */
public abstract class CastingSkill<E extends EntitySkill> {

    @Getter private final E owning;
    @Getter private final SkillSubject subject;

    public CastingSkill(E owning, SkillSubject subject) {
        this.owning = owning;
        this.subject = subject;
    }

    protected abstract void perform(SkillOperation operation, SkillSubject.CastOperator operator) throws UnsupportedOperationException;

}
