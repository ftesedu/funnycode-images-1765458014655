--Liệt kê toàn bộ thông tin của tất cả khách hàng trong bảng KHACHHANG.
select * from [dbo].[KHACHHANG]

--Hiển thị tên sản phẩm (TENSP) và giá (GIA) của tất cả các sản phẩm trong bảng SANPHAM.
select [TENSP], [GIA] from [dbo].[SANPHAM]

--Lấy ra danh sách họ tên và số điện thoại của các nhân viên trong bảng NHANVIEN.
select [HOTEN], [SODT] from [dbo].[NHANVIEN]

--Liệt kê tất cả hóa đơn (SOHD, NGHD) có mã khách hàg là KH01.
select [SOHD], [NGHD] from [dbo].[HOADON] where [MAKH] = 'KH01'

--Tìm thông tin các khách hàng có DOANHSO > 300000.
select * from [dbo].[KHACHHANG] where [DOANHSO] > 300000

--Hiển thị danh sách các sản phẩm có NUOCSX = 'VN' và giá nhỏ hơn 50,000.
select * from [dbo].[SANPHAM] where [NUOCSX] = 'Viet Nam' and [GIA] < 50000

--Lấy thông tin hóa đơn trong khoảng thời gian từ 01/01/2022 đến 31/12/2022.
select * from [dbo].[HOADON] where [NGHD] between '2022-01-01' and '2022-12-31'

--Hiển thị danh sách các khách hàng có họ tên bắt đầu bằng "Nguyen".
select * from [dbo].[KHACHHANG] where [HOTEN] like 'Nguyen%'

--Tìm tất cả hóa đơn có tổng trị giá (TRIGIA) lớn hơn 1,000,000.
select * from [dbo].[HOADON] where [TRIGIA] > 1000000

--Liệt kê danh sách các khách hàng sinh năm 2000.
select * from [dbo].[KHACHHANG] where year([NGSINH]) = 2000

--Lấy danh sách nhân viên có ngày vào làm (NGVL) trong năm 2020.
select [MANV], [HOTEN] from [dbo].[NHANVIEN] where year([NGVL]) = 2020

--Hiển thị danh sách mã khách hàng (MAKH) xuất hiện trong bảng HOADON (dùng DISTINCT để tránh trùng).
select distinct [MAKH] from [dbo].[HOADON]

--Tìm tất cả sản phẩm có giá nằm trong khoảng từ 20,000 đến 100,000.
select * from [dbo].[SANPHAM] where [GIA] between 20000 and 100000

--Liệt kê thông tin khách hàng sắp xếp theo DOANHSO giảm dần.
select * from [dbo].[KHACHHANG] order by [DOANHSO] desc

--Tìm các hóa đơn phát hành trong vòng 7 ngày gần nhất (so với ngày hiện tại).
select [SOHD], [NGHD], [TRIGIA] from [dbo].[HOADON] where [NGHD] >= dateadd(day, -7, getdate())