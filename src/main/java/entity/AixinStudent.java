package entity;

public class AixinStudent {
    private Integer id;
    //同样与数据库字段名对应
    private Integer info_studentId;
    private String stuCard;
    private String balanceRiyong;
    private String balanceFuzhuang;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInfo_studentId() {
        return info_studentId;
    }

    public void setInfo_studentId(Integer info_studentId) {
        this.info_studentId = info_studentId;
    }

    public String getStuCard() {
        return stuCard;
    }

    public void setStuCard(String stuCard) {
        this.stuCard = stuCard;
    }

    public String getBalanceRiyong() {
        return balanceRiyong;
    }

    public void setBalanceRiyong(String balanceRiyong) {
        this.balanceRiyong = balanceRiyong;
    }

    public String getBalanceFuzhuang() {
        return balanceFuzhuang;
    }

    public void setBalanceFuzhuang(String balanceFuzhuang) {
        this.balanceFuzhuang = balanceFuzhuang;
    }

    public AixinStudent(Integer info_studentId, String stuCard, String balanceRiyong, String balanceFuzhuang) {
        this.info_studentId = info_studentId;
        this.stuCard = stuCard;
        this.balanceRiyong = balanceRiyong;
        this.balanceFuzhuang = balanceFuzhuang;
    }
}
