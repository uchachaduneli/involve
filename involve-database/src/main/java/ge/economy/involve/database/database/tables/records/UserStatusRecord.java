/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables.records;


import ge.economy.involve.database.database.tables.UserStatus;

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
public class UserStatusRecord extends UpdatableRecordImpl<UserStatusRecord> implements Record3<Integer, String, String> {

	private static final long serialVersionUID = -2136347396;

	/**
	 * Setter for <code>public.user_status.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.user_status.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.user_status.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.user_status.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.user_status.human_name</code>.
	 */
	public void setHumanName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.user_status.human_name</code>.
	 */
	public String getHumanName() {
		return (String) getValue(2);
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
	public Row3<Integer, String, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return UserStatus.USER_STATUS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return UserStatus.USER_STATUS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return UserStatus.USER_STATUS.HUMAN_NAME;
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
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getHumanName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatusRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatusRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatusRecord value3(String value) {
		setHumanName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatusRecord values(Integer value1, String value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserStatusRecord
	 */
	public UserStatusRecord() {
		super(UserStatus.USER_STATUS);
	}

	/**
	 * Create a detached, initialised UserStatusRecord
	 */
	public UserStatusRecord(Integer id, String name, String humanName) {
		super(UserStatus.USER_STATUS);

		setValue(0, id);
		setValue(1, name);
		setValue(2, humanName);
	}
}
