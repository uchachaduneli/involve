/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.converter.TimestampConverter;
import ge.economy.involve.database.database.Keys;
import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.tables.records.PriorityVoteRecord;

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
public class PriorityVote extends TableImpl<PriorityVoteRecord> {

	private static final long serialVersionUID = -1227585784;

	/**
	 * The reference instance of <code>public.priority_vote</code>
	 */
	public static final PriorityVote PRIORITY_VOTE = new PriorityVote();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PriorityVoteRecord> getRecordType() {
		return PriorityVoteRecord.class;
	}

	/**
	 * The column <code>public.priority_vote.id</code>.
	 */
	public final TableField<PriorityVoteRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.priority_vote.priority_id</code>.
	 */
	public final TableField<PriorityVoteRecord, Integer> PRIORITY_ID = createField("priority_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.priority_vote.priority_item_id</code>.
	 */
	public final TableField<PriorityVoteRecord, Integer> PRIORITY_ITEM_ID = createField("priority_item_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.priority_vote.answer_id</code>.
	 */
	public final TableField<PriorityVoteRecord, Integer> ANSWER_ID = createField("answer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.priority_vote.user_id</code>.
	 */
	public final TableField<PriorityVoteRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.priority_vote.group_id</code>.
	 */
	public final TableField<PriorityVoteRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.priority_vote.create_date</code>.
	 */
	public final TableField<PriorityVoteRecord, Date> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new TimestampConverter());

	/**
	 * Create a <code>public.priority_vote</code> table reference
	 */
	public PriorityVote() {
		this("priority_vote", null);
	}

	/**
	 * Create an aliased <code>public.priority_vote</code> table reference
	 */
	public PriorityVote(String alias) {
		this(alias, PRIORITY_VOTE);
	}

	private PriorityVote(String alias, Table<PriorityVoteRecord> aliased) {
		this(alias, aliased, null);
	}

	private PriorityVote(String alias, Table<PriorityVoteRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PriorityVoteRecord> getPrimaryKey() {
		return Keys.PRIORITY_VOTE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PriorityVoteRecord>> getKeys() {
		return Arrays.<UniqueKey<PriorityVoteRecord>>asList(Keys.PRIORITY_VOTE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PriorityVote as(String alias) {
		return new PriorityVote(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PriorityVote rename(String name) {
		return new PriorityVote(name, null);
	}
}
