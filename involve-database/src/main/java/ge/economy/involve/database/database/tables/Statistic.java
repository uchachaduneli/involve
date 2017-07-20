/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.tables.records.StatisticRecord;
import ge.economy.involve.database.converter.TimestampConverter;
import ge.economy.involve.database.database.Keys;

import java.util.Arrays;
import java.util.Date;
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
public class Statistic extends TableImpl<StatisticRecord> {

	private static final long serialVersionUID = -545191537;

	/**
	 * The reference instance of <code>public.statistic</code>
	 */
	public static final Statistic STATISTIC = new Statistic();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<StatisticRecord> getRecordType() {
		return StatisticRecord.class;
	}

	/**
	 * The column <code>public.statistic.id</code>.
	 */
	public final TableField<StatisticRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.statistic.region_id</code>.
	 */
	public final TableField<StatisticRecord, Integer> REGION_ID = createField("region_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.statistic.sport_type_id</code>.
	 */
	public final TableField<StatisticRecord, Integer> SPORT_TYPE_ID = createField("sport_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.statistic.rank_id</code>.
	 */
	public final TableField<StatisticRecord, Integer> RANK_ID = createField("rank_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.statistic.gender_id</code>.
	 */
	public final TableField<StatisticRecord, Integer> GENDER_ID = createField("gender_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.statistic.range_from</code>.
	 */
	public final TableField<StatisticRecord, Integer> RANGE_FROM = createField("range_from", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.statistic.range_to</code>.
	 */
	public final TableField<StatisticRecord, Integer> RANGE_TO = createField("range_to", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.statistic.count</code>.
	 */
	public final TableField<StatisticRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.statistic.type_id</code>.
	 */
	public final TableField<StatisticRecord, Integer> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.statistic.range_type_id</code>.
	 */
	public final TableField<StatisticRecord, Integer> RANGE_TYPE_ID = createField("range_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.statistic.create_date</code>.
	 */
	public final TableField<StatisticRecord, Date> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "", new TimestampConverter());

	/**
	 * The column <code>public.statistic.is_para</code>.
	 */
	public final TableField<StatisticRecord, Boolean> IS_PARA = createField("is_para", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * Create a <code>public.statistic</code> table reference
	 */
	public Statistic() {
		this("statistic", null);
	}

	/**
	 * Create an aliased <code>public.statistic</code> table reference
	 */
	public Statistic(String alias) {
		this(alias, STATISTIC);
	}

	private Statistic(String alias, Table<StatisticRecord> aliased) {
		this(alias, aliased, null);
	}

	private Statistic(String alias, Table<StatisticRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<StatisticRecord, Integer> getIdentity() {
		return Keys.IDENTITY_STATISTIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<StatisticRecord> getPrimaryKey() {
		return Keys.STATISTIC_SPORTSMAN_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<StatisticRecord>> getKeys() {
		return Arrays.<UniqueKey<StatisticRecord>>asList(Keys.STATISTIC_SPORTSMAN_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Statistic as(String alias) {
		return new Statistic(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Statistic rename(String name) {
		return new Statistic(name, null);
	}
}
