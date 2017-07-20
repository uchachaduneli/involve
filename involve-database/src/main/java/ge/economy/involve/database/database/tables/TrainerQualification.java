/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.database.Keys;
import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.tables.records.TrainerQualificationRecord;

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
public class TrainerQualification extends TableImpl<TrainerQualificationRecord> {

	private static final long serialVersionUID = 1959691750;

	/**
	 * The reference instance of <code>public.trainer_qualification</code>
	 */
	public static final TrainerQualification TRAINER_QUALIFICATION = new TrainerQualification();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TrainerQualificationRecord> getRecordType() {
		return TrainerQualificationRecord.class;
	}

	/**
	 * The column <code>public.trainer_qualification.id</code>.
	 */
	public final TableField<TrainerQualificationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.trainer_qualification.name</code>.
	 */
	public final TableField<TrainerQualificationRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>public.trainer_qualification</code> table reference
	 */
	public TrainerQualification() {
		this("trainer_qualification", null);
	}

	/**
	 * Create an aliased <code>public.trainer_qualification</code> table reference
	 */
	public TrainerQualification(String alias) {
		this(alias, TRAINER_QUALIFICATION);
	}

	private TrainerQualification(String alias, Table<TrainerQualificationRecord> aliased) {
		this(alias, aliased, null);
	}

	private TrainerQualification(String alias, Table<TrainerQualificationRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TrainerQualificationRecord, Integer> getIdentity() {
		return Keys.IDENTITY_TRAINER_QUALIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TrainerQualificationRecord> getPrimaryKey() {
		return Keys.QUALIFICATION_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TrainerQualificationRecord>> getKeys() {
		return Arrays.<UniqueKey<TrainerQualificationRecord>>asList(Keys.QUALIFICATION_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrainerQualification as(String alias) {
		return new TrainerQualification(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TrainerQualification rename(String name) {
		return new TrainerQualification(name, null);
	}
}
