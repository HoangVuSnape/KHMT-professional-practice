# How to run 
- javac -d bin Part1/Ex1_3.java
- java -cp bin Part1.Ex1_3

# Part 1

Viết chương trình nhập vào số nguyên dương N, và tiếp theo là dãy số gồm N số nguyên từ bàn phím (Theo đúng thứ tự)
- Câu 1: Đếm số lượng số khác nhau có trong mảng
Ví dụ: Nhập:  5 3 2 2 9 2
Kết quả: 3

- Câu 1.1 Tìm giá trị nhỏ nhất trong mảng

- Câu 1.2 Tính tổng các số có trong mảng / hiệu/ …
- 
- Câu 1.3 Đảo nghịch mảng đã nhập


- Câu 1.5: Nhập 1 số, chuyển số đó qua nhị phân
Số thập phân (decimal) là hệ thống số dựa trên cơ số 10, là cơ số phổ biến nhất trong cuộc sống hàng ngày của chúng ta. Nó sử dụng 10 chữ số từ 0 đến 9 để biểu diễn mọi giá trị. Mỗi chữ số trong số thập phân đại diện cho một giá trị nhất định tùy thuộc vào vị trí của nó trong dãy số.
Ví dụ, số thập phân 125 gồm 3 chữ số 1, 2 và 5. Để hiểu giá trị của mỗi chữ số trong số thập phân, ta sử dụng các bậc cơ số. Trong trường hợp của số 125, ta có:
Chữ số 5 đứng ở vị trí hàng đơn vị (bậc 0).
Chữ số 2 đứng ở vị trí hàng chục (bậc 1).
Chữ số 1 đứng ở vị trí hàng trăm (bậc 2).
Vậy số 125 trong hệ thống số thập phân được biểu diễn như sau:
125 = 1 * 10^2 + 2 * 10^1 + 5 * 10^0
Số thập phân cũng có thể biểu diễn các giá trị có phần thập phân, thông qua việc sử dụng dấu chấm (.) để phân tách giữa phần nguyên và phần thập phân. Ví dụ: 3.14 là một số thập phân, trong đó 3 là phần nguyên và 14 là phần thập phân.

Số nhị phân (binary) là hệ thống số dựa trên cơ số 2, trong đó chỉ sử dụng hai ký tự là 0 và 1 để biểu diễn các giá trị. Mỗi chữ số trong số nhị phân đại diện cho một giá trị tùy thuộc vào vị trí của nó trong dãy số.
Ví dụ, số nhị phân 101 gồm 3 chữ số 1, 0 và 1. Để hiểu giá trị của mỗi chữ số trong số nhị phân, ta sử dụng các bậc cơ số. Trong trường hợp của số 101, ta có:
Chữ số 1 đứng ở vị trí bậc 0 (hay còn gọi là bit thấp nhất), đại diện cho giá trị 1.
Chữ số 0 đứng ở vị trí bậc 1, đại diện cho giá trị 0.
Chữ số 1 đứng ở vị trí bậc 2, đại diện cho giá trị 1.
Vậy số 101 trong hệ thống số nhị phân được biểu diễn như sau:
101 = 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = 4 + 0 + 1 = 5
Để chuyển số thập phân 126 sang số nhị phân bằng phương pháp giải tay (hay còn gọi là phương pháp chia 2 liên tiếp), ta thực hiện các bước sau:
Bước 1: Chia 126 cho 2, lấy phần nguyên và phần dư.
Copy code
126 ÷ 2 = 63 ... 0 
Bước 2: Chia 63 cho 2, lấy phần nguyên và phần dư.
Copy code
63 ÷ 2 = 31 ... 1 
Bước 3: Chia 31 cho 2, lấy phần nguyên và phần dư.
Copy code
31 ÷ 2 = 15 ... 1 
Bước 4: Chia 15 cho 2, lấy phần nguyên và phần dư.
Copy code
15 ÷ 2 = 7 ... 1 
Bước 5: Chia 7 cho 2, lấy phần nguyên và phần dư.
Copy code
7 ÷ 2 = 3 ... 1 
Bước 6: Chia 3 cho 2, lấy phần nguyên và phần dư.
Copy code
3 ÷ 2 = 1 ... 1 
Bước 7: Chia 1 cho 2, lấy phần nguyên và phần dư.
Copy code
1 ÷ 2 = 0 ... 1 
Quá trình dừng lại khi phần nguyên bằng 0. Bây giờ, ta đọc các phần dư từ dưới lên để tạo thành số nhị phân:
cssCopy code
126 (thập phân) = 1111110 (nhị phân) 


Thập lục phân (hexadecimal) là một hệ thống số dựa trên cơ số 16, trong đó sử dụng 16 ký tự để biểu diễn các giá trị từ 0 đến 15. Các ký tự của hệ thống số thập lục phân bao gồm các chữ số từ 0 đến 9 và các chữ cái từ A đến F (hoặc a đến f). Mỗi chữ số trong số thập lục phân đại diện cho một giá trị tùy thuộc vào vị trí của nó trong dãy số.
Trong hệ thập lục phân (hexadecimal), có 16 kí tự được sử dụng để biểu diễn các giá trị từ 0 đến 15. Các kí tự này bao gồm:
Các chữ số từ 0 đến 9: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
Các chữ cái từ A đến F (hoặc a đến f): A, B, C, D, E, F (hoặc a, b, c, d, e, f)
Các chữ số từ 0 đến 9 đại diện cho các giá trị từ 0 đến 9 trong hệ thập lục phân. Các chữ cái từ A đến F (hoặc a đến f) đại diện cho các giá trị từ 10 đến 15 trong hệ thập lục phân. 
Để chuyển số thập phân 126 sang hệ thập lục phân (hệ 16) bằng phương pháp giải tay, ta thực hiện các bước sau:
Bước 1: Chia 126 cho 16, lấy phần nguyên và phần dư.
cssCopy code
126 ÷ 16 = 7 ... 14 (phần dư 14 tương đương với ký tự 'E' trong hệ thập lục phân) 
Bước 2: Chia 7 cho 16, lấy phần nguyên và phần dư.
Copy code
7 ÷ 16 = 0 ... 7 
Quá trình dừng lại khi phần nguyên bằng 0. Bây giờ, ta đọc các phần dư từ dưới lên để tạo thành số hệ thập lục phân:
cssCopy code
126 (thập phân) = 7E (hệ thập lục phân)

Số nguyên tố là một số tự nhiên lớn hơn 1 và chỉ có hai ước số dương phân biệt là 1 và chính nó. Nghĩa là, số nguyên tố không thể chia hết cho bất kỳ số nào khác ngoài 1 và chính nó mà không dư số.
Ví dụ về các số nguyên tố nhỏ hơn 20 là: 2, 3, 5, 7, 11, 13, 17 và 19.
Số 1 không được xem là số nguyên tố vì nó chỉ có một ước số là 1.

- Câu 1.6: viết chương trình nhập vào một chuỗi, sau đó tìm và xuất ra từ ngắn nhất cuối cùng và từ dài nhất đầu tiên trong chuỗi







## Phần 2. Lập trình hướng đối tượng / chuẩn viết code (25%)
Thiết kế lớp đối tượng theo yêu cầu
Xây dựng các phương thức theo yêu cầu
Ngôn ngữ sử dụng: Java
Phạm vi ôn tập ở các môn: Cấu trúc dữ liệu 1, Lập trình hướng đối tượng


-------------