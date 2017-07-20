/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.Keys;
import ge.economy.involve.database.database.tables.records.ChampionshipSubTypeRecord;

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
public class ChampionshipSubType extends TableImpl<ChampionshipSubTypeRecord> {

	private static final long serialVersionUID = -906196979;

	/**
	 * The reference instance of <code>public.championship_sub_type</code>
	 */
	public static final ChampionshipSubType CHAMPIONSHIP_SUB_TYPE = new ChampionshipSubType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ChampionshipSubTypeRecord> getRecordType() {
		return ChampionshipSubTypeRecord.class;
	}

	/**
	 * The column <code>public.championship_sub_type.id</code>.
	 */
	public final TableField<ChampionshipSubTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.championship_sub_type.name</code>.
	 */
	public final TableField<ChampionshipSubTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>public.championship_sub_type</code> table reference
	 */
	public ChampionshipSubType() {
		this("championship_sub_type", null);
	}

	/**
	 * Create an aliased <code>public.championship_sub_type</code> table reference
	 */
	public ChampionshipSubType(String alias) {
		this(alias, CHAMPIONSHIP_SUB_TYPE);
	}

	private ChampionshipSubType(String alias, Table<ChampionshipSubTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private ChampionshipSubType(String alias, Table<ChampionshipSubTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ChampionshipSubTypeRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CHAMPIONSHIP_SUB_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ChampionshipSubTypeRecord> getPrimaryKey() {
		return Keys.CHAMPIONSHIP_SUB_TYPE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ChampionshipSubTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<ChampionshipSubTypeRecord>>asList(Keys.CHAMPIONSHIP_SUB_TYPE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChampionshipSubType as(String alias) {
		return new ChampionshipSubType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ChampionshipSubType rename(String name) {
		return new ChampionshipSubType(name, null);
	}
}
