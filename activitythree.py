user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")

user1_answer = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
user2_answer = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

if user1_answer == user2_answer:
    print("It's a tie!")
elif user1_answer == 'rock':
    if user2_answer == 'scissors':
        print(user1+" wins!")
    else:
        print(user2+" wins!")
elif user1_answer == 'scissors':
    if user2_answer == 'paper':
        print(user1+" win!")
    else:
        print(user2+" wins!")
elif user1_answer == 'paper':
    if user2_answer == 'rock':
        print(user1+" wins!")
    else:
        print(user2+" win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")