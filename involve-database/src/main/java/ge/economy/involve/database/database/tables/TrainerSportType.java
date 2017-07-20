/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.database.Keys;
import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.tables.records.TrainerSportTypeRecord;

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
public class TrainerSportType extends TableImpl<TrainerSportTypeRecord> {

	private static final long serialVersionUID = 419567573;

	/**
	 * The reference instance of <code>public.trainer_sport_type</code>
	 */
	public static final TrainerSportType TRAINER_SPORT_TYPE = new TrainerSportType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TrainerSportTypeRecord> getRecordType() {
		return TrainerSportTypeRecord.class;
	}

	/**
	 * The column <code>public.trainer_sport_type.id</code>.
	 */
	public final TableField<TrainerSportTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.trainer_sport_type.trainer_id</code>.
	 */
	public final TableField<TrainerSportTypeRecord, Integer> TRAINER_ID = createField("trainer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.trainer_sport_type.sport_type_id</code>.
	 */
	public final TableField<TrainerSportTypeRecord, Integer> SPORT_TYPE_ID = createField("sport_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.trainer_sport_type</code> table reference
	 */
	public TrainerSportType() {
		this("trainer_sport_type", null);
	}

	/**
	 * Create an aliased <code>public.trainer_sport_type</code> table reference
	 */
	public TrainerSportType(String alias) {
		this(alias, TRAINER_SPORT_TYPE);
	}

	private TrainerSportType(String alias, Table<TrainerSportTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private TrainerSportType(String alias, Table<TrainerSportTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TrainerSportTypeRecord, Integer> getIdentity() {
		return Keys.IDENTITY_TRAINER_SPORT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TrainerSportTypeRecord> getPrimaryKey() {
		return Keys.TRAINER_SPORT_TYPE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TrainerSportTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<TrainerSportTypeRecord>>asList(Keys.TRAINER_SPORT_TYPE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrainerSportType as(String alias) {
		return new TrainerSportType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TrainerSportType rename(String name) {
		return new TrainerSportType(name, null);
	}
}
