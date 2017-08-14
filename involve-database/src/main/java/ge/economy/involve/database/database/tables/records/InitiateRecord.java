/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables.records;


import ge.economy.involve.database.database.tables.Initiate;

import java.util.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class InitiateRecord extends UpdatableRecordImpl<InitiateRecord> implements Record6<Integer, Integer, String, Integer, Date, Integer> {

	private static final long serialVersionUID = 382155716;

	/**
	 * Setter for <code>public.initiate.sphere_id</code>.
	 */
	public void setSphereId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.initiate.sphere_id</code>.
	 */
	public Integer getSphereId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.initiate.user_id</code>.
	 */
	public void setUserId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.initiate.user_id</code>.
	 */
	public Integer getUserId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.initiate.description</code>.
	 */
	public void setDescription(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.initiate.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.initiate.group_id</code>.
	 */
	public void setGroupId(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.initiate.group_id</code>.
	 */
	public Integer getGroupId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.initiate.create_date</code>.
	 */
	public void setCreateDate(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.initiate.create_date</code>.
	 */
	public Date getCreateDate() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>public.initiate.id</code>.
	 */
	public void setId(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.initiate.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, String, Integer, Date, Integer> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, String, Integer, Date, Integer> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Initiate.INITIATE.SPHERE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Initiate.INITIATE.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Initiate.INITIATE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Initiate.INITIATE.GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return Initiate.INITIATE.CREATE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Initiate.INITIATE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getSphereId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getGroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value5() {
		return getCreateDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InitiateRecord value1(Integer value) {
		setSphereId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InitiateRecord value2(Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InitiateRecord value3(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InitiateRecord value4(Integer value) {
		setGroupId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InitiateRecord value5(Date value) {
		setCreateDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InitiateRecord value6(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InitiateRecord values(Integer value1, Integer value2, String value3, Integer value4, Date value5, Integer value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InitiateRecord
	 */
	public InitiateRecord() {
		super(Initiate.INITIATE);
	}

	/**
	 * Create a detached, initialised InitiateRecord
	 */
	public InitiateRecord(Integer sphereId, Integer userId, String description, Integer groupId, Date createDate, Integer id) {
		super(Initiate.INITIATE);

		setValue(0, sphereId);
		setValue(1, userId);
		setValue(2, description);
		setValue(3, groupId);
		setValue(4, createDate);
		setValue(5, id);
	}
}
