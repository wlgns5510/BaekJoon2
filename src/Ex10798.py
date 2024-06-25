# 리스트 생성
numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

# 인덱싱 예제
first_element = numbers[0]
last_element = numbers[-1]

# 슬라이싱 예제
sub_list1 = numbers[1:5]       # [1, 2, 3, 4]
sub_list2 = numbers[:3]        # [0, 1, 2]
sub_list3 = numbers[4:]        # [4, 5, 6, 7, 8, 9]
sub_list4 = numbers[::2]       # [0, 2, 4, 6, 8]
sub_list5 = numbers[::-1]      # [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
sub_list6 = numbers[1:8:2]     # [1, 3, 5, 7]

print("First element:", first_element)
print("Last element:", last_element)
print("Sub list 1:", sub_list1)
print("Sub list 2:", sub_list2)
print("Sub list 3:", sub_list3)
print("Sub list 4:", sub_list4)
print("Sub list 5:", sub_list5)
print("Sub list 6:", sub_list6)
