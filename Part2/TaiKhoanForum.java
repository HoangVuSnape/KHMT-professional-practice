package Part2;

public class TaiKhoanForum {
    private String tenDangNhap;
    private String password;
    private String ngayTao;
    private int soBaiDaDang;

    public TaiKhoanForum(String tenDangNhap, String password, String ngayTao, int soBaiDaDang) {
        this.tenDangNhap = tenDangNhap;
        this.password = password;
        this.ngayTao = ngayTao;
        this.soBaiDaDang = soBaiDaDang;
    }
    
    public boolean doiMatKhau(String old_pw, String new_pw) {

        if(!old_pw.equals(password)) {
            return false;
        }
        
        password = new_pw;
        return true; 
    }
    public String loadThanhVien() {
        if (soBaiDaDang >= 50) {
            return "Thanh vien VIP";
        } else if (soBaiDaDang >= 30) {
            return "Thanh vien nang dong";
        } else if (soBaiDaDang >= 5) {
            return "Thanh vien co dong gop";
        } else {
            return "Thanh vien moi";
        }
    }

    public String toString() {
        return "(" + tenDangNhap + ", " + ngayTao + ", " + loadThanhVien() + ")";
    }

    public static void main(String[] args) {
        TaiKhoanForum tk1 = new TaiKhoanForum("user1", "pass1", "01/01/2020", 10);
        System.out.println(tk1);
        System.out.println(tk1.tenDangNhap + " " + tk1.password + " " + tk1.ngayTao + " " + tk1.soBaiDaDang);

        boolean a = tk1.doiMatKhau("pass1", "newpass1");
        System.out.println(a);

        System.out.println(tk1.password);
        System.out.println(tk1.loadThanhVien());
        System.out.println(tk1.toString());


    }
}
