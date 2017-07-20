package ge.economy.involve.core.api.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import ge.economy.involve.core.jsonhelper.JsonDateSerializeSupport;
import ge.economy.involve.database.database.Tables;
import org.jooq.Record;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by nl on 7/25/2016.
 */
public class RefereeDTO {

    private Integer id;
    private  String firstName;
    private  String lastName;
    private  Integer sportTypeId;
    private  String sportTypeName;
    private  Integer categoryId;
    private  String categoryName;
    private  String experience;
    @JsonSerialize(using = JsonDateSerializeSupport.class)
    private Date birthDate;
    @JsonSerialize(using = JsonDateSerializeSupport.class)
    private Date careerStartDate;
    @JsonSerialize(using = JsonDateSerializeSupport.class)
    private Date careerEndDate;
    @JsonSerialize(using = JsonDateSerializeSupport.class)
    private Date deathDate;
    private Integer genderId;
    private String genderName;
    private Integer regionId;
    private String regionName;
    private Integer cityId;
    private String cityName;
    private String biography;
    private String comment;

    private List<RefereeSportTypeDTO> sportTypes = new ArrayList<RefereeSportTypeDTO>();

    public static RefereeDTO translate(Record record) {
        RefereeDTO dto = new RefereeDTO();
        dto.setId(record.getValue(Tables.REFEREE.ID));
        dto.setFirstName(record.getValue(Tables.REFEREE.FIRST_NAME));
        dto.setLastName(record.getValue(Tables.REFEREE.LAST_NAME));
        dto.setCategoryId(record.getValue(Tables.REFEREE.CATEGORY_ID));
        dto.setCategoryName(record.getValue(Tables.REFEREE_CATEGORY.NAME));
        dto.setExperience(record.getValue(Tables.REFEREE.EXPERIENCE));
        dto.setBirthDate(record.getValue(Tables.REFEREE.BIRTH_DATE));
        dto.setGenderId(record.getValue(Tables.GENDER.ID));
        dto.setGenderName(record.getValue(Tables.GENDER.NAME));
        dto.setRegionId(record.getValue(Tables.REGION.ID));
        dto.setRegionName(record.getValue(Tables.REGION.NAME));
        dto.setCityId(record.getValue(Tables.CITY.ID));
        dto.setCityName(record.getValue(Tables.CITY.NAME));
        dto.setDeathDate(record.getValue(Tables.REFEREE.DEATH_DATE));
        dto.setCareerStartDate(record.getValue(Tables.REFEREE.CAREER_START_DATE));
        dto.setCareerEndDate(record.getValue(Tables.REFEREE.CAREER_END_DATE));
        dto.setBiography(record.getValue(Tables.REFEREE.BIOGRAPHY));
        dto.setComment(record.getValue(Tables.REFEREE.COMMENT));
        return dto;
    }


    public static List<RefereeDTO> translateArray(List<Record> records) {
        ArrayList<RefereeDTO> list = new ArrayList<RefereeDTO>();
        for (Record record : records) {
            list.add(RefereeDTO.translate(record));
        }
        return list;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSportTypeId() {
        return sportTypeId;
    }

    public void setSportTypeId(Integer sportTypeId) {
        this.sportTypeId = sportTypeId;
    }

    public String getSportTypeName() {
        return sportTypeName;
    }

    public void setSportTypeName(String sportTypeName) {
        this.sportTypeName = sportTypeName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<RefereeSportTypeDTO> getSportTypes() {
        return sportTypes;
    }

    public void setSportTypes(List<RefereeSportTypeDTO> sportTypes) {
        this.sportTypes = sportTypes;
    }

    public Date getCareerStartDate() {
        return careerStartDate;
    }

    public void setCareerStartDate(Date careerStartDate) {
        this.careerStartDate = careerStartDate;
    }

    public Date getCareerEndDate() {
        return careerEndDate;
    }

    public void setCareerEndDate(Date careerEndDate) {
        this.careerEndDate = careerEndDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
