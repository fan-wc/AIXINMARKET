package entity;

public class InfoStudent {
    //参数名和数据库字段名对应
    private String xuejiNum;
    private String stuNum;
    private String name;
    private Integer departmentId;
    private Integer specialId;
    private Integer grade;
    private Enum eduLevel;
    private Integer campus;
    private Integer imburseType;

    public InfoStudent(String xuejiNum, String stuNum, String name, Integer departmentId, Integer specialId, Integer grade, Integer campus, Integer imburseType) {
        this.xuejiNum = xuejiNum;
        this.stuNum = stuNum;
        this.name = name;
        this.departmentId = departmentId;
        this.specialId = specialId;
        this.grade = grade;
        this.campus = campus;
        this.imburseType = imburseType;
    }

    public Integer getImburseType() {
        return imburseType;
    }

    public void setImburseType(Integer imburseType) {
        this.imburseType = imburseType;
    }

    public String getXuejiNum() {
        return xuejiNum;
    }

    public void setXuejiNum(String xuejiNum) {
        this.xuejiNum = xuejiNum;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Integer specialId) {
        this.specialId = specialId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Enum getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(Enum eduLevel) {
        this.eduLevel = eduLevel;
    }

    public Integer getCampus() {
        return campus;
    }

    public void setCampus(Integer campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "InfoStudent{" +
                "xuejiNum='" + xuejiNum + '\'' +
                ", stuNum='" + stuNum + '\'' +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", specialId=" + specialId +
                ", grade=" + grade +
                ", eduLevel=" + eduLevel +
                ", campus=" + campus +
                ", imburseType=" + imburseType +
                '}';
    }
}
