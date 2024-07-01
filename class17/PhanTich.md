# Cách phân tích Class
## Bài toán

Xây dựng 1 con tướng liên minh có
các chỉ số: Tấn công, phòng thủ, di chuyển, tầm đánh
Có 4 chiêu thức


Khi gọi chiêu thức thì sẽ thực hiện tấn công bằng
chiêu thức đó (in ra màn hình tên của chiêu thức)
Trong trường hoợp nhấn Q thì in ra "Tôi đã dùng
skill Q"


Cho yasuo chém riven 1 hit
Cho riven chém yasuo 1 hit
-> Tính máu bị mất của 2

## Khi gặp bài toán
1. Không code gì cả
2. Phân tích các đối tượng trong bài toán(Class) và các thành phần của nó

Con tướng
   - Tên
   - Tấn công
   - phòng thủ
   - di chuyển
   - tầm đánh
   - 4 Chiêu thức
   - Tính dame khi trade hit với kẻ thù

3. Đánh dấu các thành phần của đối tượng thành thuộc tính và phương thức

Con tướng -> Class
- Tên -> thành phần -> Class Attribute
- Tấn công -> thành phần -> Class Attribute
- phòng thủ -> thành phần -> Class Attribute
- di chuyển -> thành phần -> Class Attribute
- tầm đánh -> thành phần -> Class Attribute
- 4 Chiêu thức -> hành động -> Class method: Q, W, E, R
- Tính dame khi trade hit với kẻ thù -> hành động -> Class method


4. Đi code 

```java
public class Champion{
    String name;
    int attackDamage;
    int armor;
    int moveSpeed;
    int attackRange;
    
    public void skillQ(){
        System.out.println("Tôi là " +name + " đã đánh skill Q" );
    }
    public void skillW(){
        System.out.println("Tôi là " +name + " đã đánh skill W" );
    }
    public void skillE(){
        System.out.println("Tôi là " +name + " đã đánh skill E" );
    }
    public void skillR(){
        System.out.println("Tôi là " +name + " đã đánh skill R" );
    }
}

```



## Bài toán 2
Tạo một lớp Kỹ năng của tướng có các thông số sau: Tên, Mô tả, Sát thương vật lý, Sát thương phép thuật, công thức tính sát thương dựa vào sát thương vật lý và sức mạnh phép thuật tuỳ theo mỗi skill sẽ có trọng số khác nhau

Cho phép khởi tại 2 kỹ năng là: Bão kiếm, Tường gió, Quét kiếm, Trăn trối, Tam bộ kiếm, Kình lực, Anh dũng, Lưỡi kiếm lưu đày. Và tính sát thương của các kỹ năng này theo từng tường



2. Phân tích



























