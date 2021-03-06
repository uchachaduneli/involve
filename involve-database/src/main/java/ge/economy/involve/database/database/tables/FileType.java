/**
 * This class is generated by jOOQ
 */
package ge.economy.involve.database.database.tables;


import ge.economy.involve.database.database.Keys;
import ge.economy.involve.database.database.Public;
import ge.economy.involve.database.database.tables.records.FileTypeRecord;

import java.util.Arrays;
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
public class FileType extends TableImpl<FileTypeRecord> {

	private static final long serialVersionUID = -1941639629;

	/**
	 * The reference instance of <code>public.file_type</code>
	 */
	public static final FileType FILE_TYPE = new FileType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FileTypeRecord> getRecordType() {
		return FileTypeRecord.class;
	}

	/**
	 * The column <code>public.file_type.id</code>.
	 */
	public final TableField<FileTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.file_type.name</code>.
	 */
	public final TableField<FileTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>public.file_type</code> table reference
	 */
	public FileType() {
		this("file_type", null);
	}

	/**
	 * Create an aliased <code>public.file_type</code> table reference
	 */
	public FileType(String alias) {
		this(alias, FILE_TYPE);
	}

	private FileType(String alias, Table<FileTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private FileType(String alias, Table<FileTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<FileTypeRecord> getPrimaryKey() {
		return Keys.FILE_TYPE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<FileTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<FileTypeRecord>>asList(Keys.FILE_TYPE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileType as(String alias) {
		return new FileType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public FileType rename(String name) {
		return new FileType(name, null);
	}
}
