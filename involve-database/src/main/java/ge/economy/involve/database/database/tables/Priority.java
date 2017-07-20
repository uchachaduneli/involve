/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.converter.TimestampConverter;
import ge.economy.involve.database.database.Keys;
import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.tables.records.PriorityRecord;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Priority extends TableImpl<PriorityRecord> {

	private static final long serialVersionUID = -1650286770;

	/**
	 * The reference instance of <code>public.priority</code>
	 */
	public static final Priority PRIORITY = new Priority();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PriorityRecord> getRecordType() {
		return PriorityRecord.class;
	}

	/**
	 * The column <code>public.priority.id</code>.
	 */
	public final TableField<PriorityRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.priority.name</code>.
	 */
	public final TableField<PriorityRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.priority.description</code>.
	 */
	public final TableField<PriorityRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.priority.type_id</code>.
	 */
	public final TableField<PriorityRecord, Integer> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.priority.create_date</code>.
	 */
	public final TableField<PriorityRecord, Date> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new TimestampConverter());

	/**
	 * Create a <code>public.priority</code> table reference
	 */
	public Priority() {
		this("priority", null);
	}

	/**
	 * Create an aliased <code>public.priority</code> table reference
	 */
	public Priority(String alias) {
		this(alias, PRIORITY);
	}

	private Priority(String alias, Table<PriorityRecord> aliased) {
		this(alias, aliased, null);
	}

	private Priority(String alias, Table<PriorityRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PriorityRecord> getPrimaryKey() {
		return Keys.PRIORITY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PriorityRecord>> getKeys() {
		return Arrays.<UniqueKey<PriorityRecord>>asList(Keys.PRIORITY_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Priority as(String alias) {
		return new Priority(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Priority rename(String name) {
		return new Priority(name, null);
	}
}
