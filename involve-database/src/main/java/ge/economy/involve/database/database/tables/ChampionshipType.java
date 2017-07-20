/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.database.Keys;
import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.tables.records.ChampionshipTypeRecord;

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
public class ChampionshipType extends TableImpl<ChampionshipTypeRecord> {

	private static final long serialVersionUID = -154880218;

	/**
	 * The reference instance of <code>public.championship_type</code>
	 */
	public static final ChampionshipType CHAMPIONSHIP_TYPE = new ChampionshipType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ChampionshipTypeRecord> getRecordType() {
		return ChampionshipTypeRecord.class;
	}

	/**
	 * The column <code>public.championship_type.id</code>.
	 */
	public final TableField<ChampionshipTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.championship_type.name</code>.
	 */
	public final TableField<ChampionshipTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>public.championship_type</code> table reference
	 */
	public ChampionshipType() {
		this("championship_type", null);
	}

	/**
	 * Create an aliased <code>public.championship_type</code> table reference
	 */
	public ChampionshipType(String alias) {
		this(alias, CHAMPIONSHIP_TYPE);
	}

	private ChampionshipType(String alias, Table<ChampionshipTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private ChampionshipType(String alias, Table<ChampionshipTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ChampionshipTypeRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CHAMPIONSHIP_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ChampionshipTypeRecord> getPrimaryKey() {
		return Keys.CHEMPIONSHIP_TYPE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ChampionshipTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<ChampionshipTypeRecord>>asList(Keys.CHEMPIONSHIP_TYPE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChampionshipType as(String alias) {
		return new ChampionshipType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ChampionshipType rename(String name) {
		return new ChampionshipType(name, null);
	}
}
