/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.converter.TimestampConverter;
import ge.economy.involve.database.database.Keys;
import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.tables.records.InitiativeVoteRecord;

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
public class InitiativeVote extends TableImpl<InitiativeVoteRecord> {

	private static final long serialVersionUID = -1222920258;

	/**
	 * The reference instance of <code>public.initiative_vote</code>
	 */
	public static final InitiativeVote INITIATIVE_VOTE = new InitiativeVote();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InitiativeVoteRecord> getRecordType() {
		return InitiativeVoteRecord.class;
	}

	/**
	 * The column <code>public.initiative_vote.id</code>.
	 */
	public final TableField<InitiativeVoteRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.initiative_vote.initiated_issue_id</code>.
	 */
	public final TableField<InitiativeVoteRecord, Integer> INITIATED_ISSUE_ID = createField("initiated_issue_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.initiative_vote.user_id</code>.
	 */
	public final TableField<InitiativeVoteRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.initiative_vote.agreed</code>.
	 */
	public final TableField<InitiativeVoteRecord, Boolean> AGREED = createField("agreed", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>public.initiative_vote.create_date</code>.
	 */
	public final TableField<InitiativeVoteRecord, Date> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new TimestampConverter());

	/**
	 * Create a <code>public.initiative_vote</code> table reference
	 */
	public InitiativeVote() {
		this("initiative_vote", null);
	}

	/**
	 * Create an aliased <code>public.initiative_vote</code> table reference
	 */
	public InitiativeVote(String alias) {
		this(alias, INITIATIVE_VOTE);
	}

	private InitiativeVote(String alias, Table<InitiativeVoteRecord> aliased) {
		this(alias, aliased, null);
	}

	private InitiativeVote(String alias, Table<InitiativeVoteRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<InitiativeVoteRecord> getPrimaryKey() {
		return Keys.INITIATIVE_VOTE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<InitiativeVoteRecord>> getKeys() {
		return Arrays.<UniqueKey<InitiativeVoteRecord>>asList(Keys.INITIATIVE_VOTE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InitiativeVote as(String alias) {
		return new InitiativeVote(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InitiativeVote rename(String name) {
		return new InitiativeVote(name, null);
	}
}
