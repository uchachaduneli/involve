/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.converter.TimestampConverter;
import ge.economy.involve.database.database.Keys;
import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.tables.records.SessionVoteRecord;

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
public class SessionVote extends TableImpl<SessionVoteRecord> {

	private static final long serialVersionUID = 900403751;

	/**
	 * The reference instance of <code>public.session_vote</code>
	 */
	public static final SessionVote SESSION_VOTE = new SessionVote();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SessionVoteRecord> getRecordType() {
		return SessionVoteRecord.class;
	}

	/**
	 * The column <code>public.session_vote.id</code>.
	 */
	public final TableField<SessionVoteRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.session_vote.session_id</code>.
	 */
	public final TableField<SessionVoteRecord, Integer> SESSION_ID = createField("session_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.session_vote.user_id</code>.
	 */
	public final TableField<SessionVoteRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.session_vote.mail</code>.
	 */
	public final TableField<SessionVoteRecord, String> MAIL = createField("mail", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.session_vote.agreed</code>.
	 */
	public final TableField<SessionVoteRecord, Boolean> AGREED = createField("agreed", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>public.session_vote.range_id</code>.
	 */
	public final TableField<SessionVoteRecord, Integer> RANGE_ID = createField("range_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.session_vote.profession</code>.
	 */
	public final TableField<SessionVoteRecord, String> PROFESSION = createField("profession", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.session_vote.field_of_activity</code>.
	 */
	public final TableField<SessionVoteRecord, String> FIELD_OF_ACTIVITY = createField("field_of_activity", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.session_vote.create_date</code>.
	 */
	public final TableField<SessionVoteRecord, Date> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new TimestampConverter());

	/**
	 * Create a <code>public.session_vote</code> table reference
	 */
	public SessionVote() {
		this("session_vote", null);
	}

	/**
	 * Create an aliased <code>public.session_vote</code> table reference
	 */
	public SessionVote(String alias) {
		this(alias, SESSION_VOTE);
	}

	private SessionVote(String alias, Table<SessionVoteRecord> aliased) {
		this(alias, aliased, null);
	}

	private SessionVote(String alias, Table<SessionVoteRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SessionVoteRecord> getPrimaryKey() {
		return Keys.SESSION_VOTE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SessionVoteRecord>> getKeys() {
		return Arrays.<UniqueKey<SessionVoteRecord>>asList(Keys.SESSION_VOTE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionVote as(String alias) {
		return new SessionVote(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SessionVote rename(String name) {
		return new SessionVote(name, null);
	}
}
