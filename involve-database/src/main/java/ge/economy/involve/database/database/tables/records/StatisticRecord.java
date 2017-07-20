/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables.records;


import ge.economy.involve.database.database.tables.Statistic;

import java.util.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatisticRecord extends UpdatableRecordImpl<StatisticRecord> implements Record12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Date, Boolean> {

	private static final long serialVersionUID = 1380437164;

	/**
	 * Setter for <code>public.statistic.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.statistic.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.statistic.region_id</code>.
	 */
	public void setRegionId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.statistic.region_id</code>.
	 */
	public Integer getRegionId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.statistic.sport_type_id</code>.
	 */
	public void setSportTypeId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.statistic.sport_type_id</code>.
	 */
	public Integer getSportTypeId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.statistic.rank_id</code>.
	 */
	public void setRankId(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.statistic.rank_id</code>.
	 */
	public Integer getRankId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.statistic.gender_id</code>.
	 */
	public void setGenderId(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.statistic.gender_id</code>.
	 */
	public Integer getGenderId() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.statistic.range_from</code>.
	 */
	public void setRangeFrom(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.statistic.range_from</code>.
	 */
	public Integer getRangeFrom() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.statistic.range_to</code>.
	 */
	public void setRangeTo(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.statistic.range_to</code>.
	 */
	public Integer getRangeTo() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>public.statistic.count</code>.
	 */
	public void setCount(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.statistic.count</code>.
	 */
	public Integer getCount() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>public.statistic.type_id</code>.
	 */
	public void setTypeId(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.statistic.type_id</code>.
	 */
	public Integer getTypeId() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>public.statistic.range_type_id</code>.
	 */
	public void setRangeTypeId(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.statistic.range_type_id</code>.
	 */
	public Integer getRangeTypeId() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>public.statistic.create_date</code>.
	 */
	public void setCreateDate(Date value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.statistic.create_date</code>.
	 */
	public Date getCreateDate() {
		return (Date) getValue(10);
	}

	/**
	 * Setter for <code>public.statistic.is_para</code>.
	 */
	public void setIsPara(Boolean value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.statistic.is_para</code>.
	 */
	public Boolean getIsPara() {
		return (Boolean) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Date, Boolean> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Date, Boolean> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Statistic.STATISTIC.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Statistic.STATISTIC.REGION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Statistic.STATISTIC.SPORT_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Statistic.STATISTIC.RANK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Statistic.STATISTIC.GENDER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Statistic.STATISTIC.RANGE_FROM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return Statistic.STATISTIC.RANGE_TO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return Statistic.STATISTIC.COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return Statistic.STATISTIC.TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return Statistic.STATISTIC.RANGE_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field11() {
		return Statistic.STATISTIC.CREATE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field12() {
		return Statistic.STATISTIC.IS_PARA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getRegionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getSportTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getRankId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getGenderId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getRangeFrom();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getRangeTo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getRangeTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value11() {
		return getCreateDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value12() {
		return getIsPara();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value2(Integer value) {
		setRegionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value3(Integer value) {
		setSportTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value4(Integer value) {
		setRankId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value5(Integer value) {
		setGenderId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value6(Integer value) {
		setRangeFrom(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value7(Integer value) {
		setRangeTo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value8(Integer value) {
		setCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value9(Integer value) {
		setTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value10(Integer value) {
		setRangeTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value11(Date value) {
		setCreateDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord value12(Boolean value) {
		setIsPara(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Date value11, Boolean value12) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StatisticRecord
	 */
	public StatisticRecord() {
		super(Statistic.STATISTIC);
	}

	/**
	 * Create a detached, initialised StatisticRecord
	 */
	public StatisticRecord(Integer id, Integer regionId, Integer sportTypeId, Integer rankId, Integer genderId, Integer rangeFrom, Integer rangeTo, Integer count, Integer typeId, Integer rangeTypeId, Date createDate, Boolean isPara) {
		super(Statistic.STATISTIC);

		setValue(0, id);
		setValue(1, regionId);
		setValue(2, sportTypeId);
		setValue(3, rankId);
		setValue(4, genderId);
		setValue(5, rangeFrom);
		setValue(6, rangeTo);
		setValue(7, count);
		setValue(8, typeId);
		setValue(9, rangeTypeId);
		setValue(10, createDate);
		setValue(11, isPara);
	}
}
