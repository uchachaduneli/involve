/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables.records;


import ge.economy.involve.database.database.tables.RefereeSportType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class RefereeSportTypeRecord extends UpdatableRecordImpl<RefereeSportTypeRecord> implements Record3<Integer, Integer, Integer> {

	private static final long serialVersionUID = 1366241817;

	/**
	 * Setter for <code>public.referee_sport_type.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.referee_sport_type.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.referee_sport_type.referee_id</code>.
	 */
	public void setRefereeId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.referee_sport_type.referee_id</code>.
	 */
	public Integer getRefereeId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.referee_sport_type.sport_type_id</code>.
	 */
	public void setSportTypeId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.referee_sport_type.sport_type_id</code>.
	 */
	public Integer getSportTypeId() {
		return (Integer) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return RefereeSportType.REFEREE_SPORT_TYPE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return RefereeSportType.REFEREE_SPORT_TYPE.REFEREE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return RefereeSportType.REFEREE_SPORT_TYPE.SPORT_TYPE_ID;
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
		return getRefereeId();
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
	public RefereeSportTypeRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RefereeSportTypeRecord value2(Integer value) {
		setRefereeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RefereeSportTypeRecord value3(Integer value) {
		setSportTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RefereeSportTypeRecord values(Integer value1, Integer value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RefereeSportTypeRecord
	 */
	public RefereeSportTypeRecord() {
		super(RefereeSportType.REFEREE_SPORT_TYPE);
	}

	/**
	 * Create a detached, initialised RefereeSportTypeRecord
	 */
	public RefereeSportTypeRecord(Integer id, Integer refereeId, Integer sportTypeId) {
		super(RefereeSportType.REFEREE_SPORT_TYPE);

		setValue(0, id);
		setValue(1, refereeId);
		setValue(2, sportTypeId);
	}
}
