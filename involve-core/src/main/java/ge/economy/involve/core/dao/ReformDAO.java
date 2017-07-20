package ge.economy.involve.core.dao;

import ge.economy.involve.database.database.Tables;
import ge.economy.involve.database.database.tables.records.ReformRecord;

import java.util.HashMap;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.SelectField;
import org.jooq.SelectOnConditionStep;
import org.springframework.stereotype.Repository;

@Repository
public class ReformDAO extends AbstractDAO {
    public HashMap<String, Object> getReforms(int start, int limit) {
        SelectOnConditionStep<Record> selectConditionStep = this.dslContext.select()
                .from(Tables.REFORM)
                .join(Tables.REFORM_TYPE).on(Tables.REFORM.REFORM_TYPE_ID.eq(Tables.REFORM_TYPE.ID));
        selectConditionStep.where(new Condition[0]);
        SelectOnConditionStep<Record> selectConditionStepSize = selectConditionStep;
        int recordSize = selectConditionStepSize.fetch().size();
        selectConditionStep.orderBy(Tables.REFORM.ID.desc()).limit(limit).offset(start);
        HashMap<String, Object> map = new HashMap();
        map.put("list", selectConditionStep.fetch());
        map.put("size", Integer.valueOf(recordSize));
        return map;
    }

    public Record getReformById(int id) {
        return

                this.dslContext.select()
                        .from(Tables.REFORM)
                        .join(Tables.REFORM_TYPE)
                        .on(Tables.REFORM.REFORM_TYPE_ID.eq(Tables.REFORM_TYPE.ID))
                        .where(Tables.REFORM.ID.eq(id)).fetchOne();
    }

    public ReformRecord getReformObjectById(int id) {
        return (ReformRecord) this.dslContext.fetchOne(Tables.REFORM, Tables.REFORM.ID.eq(id));
    }


    public void deleteReform(int itemId) {
        this.dslContext.deleteFrom(Tables.REFORM).where(Tables.REFORM.ID.eq(itemId)).execute();
    }

 /*   public HashMap<String, Object> searchSportsmans(String name, String firstLetter, int sportTypeId, int genderId, int regionId, int cityId, int start, int limit) {
        SelectOnConditionStep<Record> selectConditionStep = this.dslContext.select(new SelectField[0]).from(Tables.SPORTSMAN).join(Tables.REGION).on(new Condition[]{Tables.SPORTSMAN.REGION_ID.eq(Tables.REGION.ID)}).join(Tables.CITY).on(new Condition[]{Tables.SPORTSMAN.CITY_ID.eq(Tables.CITY.ID)}).join(Tables.SPORT_TYPE).on(new Condition[]{Tables.SPORTSMAN.SPORT_TYPE_ID.eq(Tables.SPORT_TYPE.ID)}).join(Tables.GENDER).on(new Condition[]{Tables.SPORTSMAN.GENDER_ID.eq(Tables.GENDER.ID)}).join(Tables.SPORTSMAN_RANK).on(new Condition[]{Tables.SPORTSMAN.RANK_ID.eq(Tables.SPORTSMAN_RANK.ID)});

        selectConditionStep.where(new Condition[0]);
        if (name != null) {
            String[] names = name.split(" ");
            if (names.length <= 1) {
                selectConditionStep.and(Tables.SPORTSMAN.FIRST_NAME.like("%" + name + "%").or(Tables.SPORTSMAN.LAST_NAME.like("%" + name + "%")));
            } else {
                selectConditionStep.and(Tables.SPORTSMAN.FIRST_NAME.like("%" + names[0] + "%").or(Tables.SPORTSMAN.LAST_NAME.like("%" + names[1] + "%")));
            }
        }
        if (firstLetter != null && firstLetter.length() > 0) {
            selectConditionStep.and(Tables.SPORTSMAN.LAST_NAME.like(firstLetter + "%"));
        }
        if (sportTypeId != 0) {
            selectConditionStep.and(Tables.SPORTSMAN.SPORT_TYPE_ID.eq(Integer.valueOf(sportTypeId)));
        }
        if (genderId != 0) {
            selectConditionStep.and(Tables.SPORTSMAN.GENDER_ID.eq(Integer.valueOf(genderId)));
        }
        if (regionId != 0) {
            selectConditionStep.and(Tables.SPORTSMAN.REGION_ID.eq(Integer.valueOf(regionId)));
        }
        if (cityId != 0) {
            selectConditionStep.and(Tables.SPORTSMAN.CITY_ID.eq(Integer.valueOf(cityId)));
        }
        SelectOnConditionStep<Record> selectConditionStepSize = selectConditionStep;
        int recordSize = selectConditionStepSize.fetch().size();
        selectConditionStep.orderBy(Tables.SPORTSMAN.ID.desc()).limit(limit).offset(start);

        HashMap<String, Object> map = new HashMap();
        map.put("list", selectConditionStep.fetch());
        map.put("size", Integer.valueOf(recordSize));
        return map;
    }*/


}