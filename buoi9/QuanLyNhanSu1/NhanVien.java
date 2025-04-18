package buoi9.QuanLyNhanSu1;

import buoi9.QuanLyNhanSu1.TinhLuong.InnerTinhLuong;

public abstract class NhanVien implements InnerTinhLuong {
        protected String hoTen;
        protected String maNV;
        protected double heSoLuong;

        public NhanVien(){

        }

        public NhanVien(String newHoTen, String newMaNV, double newHeSoLuong){
            this.hoTen = newHoTen;
            this.maNV = newMaNV;
            this.heSoLuong = newHeSoLuong;
        }

        public String getHoTen() {
            return this.hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getMaNV() {
            return this.maNV;
        }

        public void setMaNV(String maNV) {
            this.maNV = maNV;
        }

        public double getHeSoLuong() {
            return this.heSoLuong;
        }

        public void setHeSoLuong(double heSoLuong) {
            this.heSoLuong = heSoLuong;
        }
}
