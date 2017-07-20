/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.database.Keys;
import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.tables.records.SystemPropertiesGroupRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class SystemPropertiesGroup extends TableImpl<SystemPropertiesGroupRecord> {

	private static final long serialVersionUID = 760827285;

	/**
	 * The reference instance of <code>public.system_properties_group</code>
	 */
	public static final SystemPropertiesGroup SYSTEM_PROPERTIES_GROUP = new SystemPropertiesGroup();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SystemPropertiesGroupRecord> getRecordType() {
		return SystemPropertiesGroupRecord.class;
	}

	/**
	 * The column <code>public.system_properties_group.id</code>.
	 */
	public final TableField<SystemPropertiesGroupRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.system_properties_group.name</code>.
	 */
	public final TableField<SystemPropertiesGroupRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>public.system_properties_group</code> table reference
	 */
	public SystemPropertiesGroup() {
		this("system_properties_group", null);
	}

	/**
	 * Create an aliased <code>public.system_properties_group</code> table reference
	 */
	public SystemPropertiesGroup(String alias) {
		this(alias, SYSTEM_PROPERTIES_GROUP);
	}

	private SystemPropertiesGroup(String alias, Table<SystemPropertiesGroupRecord> aliased) {
		this(alias, aliased, null);
	}

	private SystemPropertiesGroup(String alias, Table<SystemPropertiesGroupRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<SystemPropertiesGroupRecord, Integer> getIdentity() {
		return Keys.IDENTITY_SYSTEM_PROPERTIES_GROUP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SystemPropertiesGroupRecord> getPrimaryKey() {
		return Keys.SYSTEM_PROPERTIES_GROUP_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SystemPropertiesGroupRecord>> getKeys() {
		return Arrays.<UniqueKey<SystemPropertiesGroupRecord>>asList(Keys.SYSTEM_PROPERTIES_GROUP_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SystemPropertiesGroup as(String alias) {
		return new SystemPropertiesGroup(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SystemPropertiesGroup rename(String name) {
		return new SystemPropertiesGroup(name, null);
	}
}
