import random
score = 0

def scoreUpdate(s): 
    print("score: ",  s)

while True:
    item = input("\nEnter a choice (rock, paper, scissors, end): ")
    if item not in ["rock", "paper", "scissors","end"]:
        print ("Unsupported Character: " + item)
        exit()
    if item == "end":
        print("\n============================ Final Score ============================ ")
        scoreUpdate(score)
        exit()
    possible_actions = ["rock", "paper", "scissors"]
    computer_action = random.choice(possible_actions)
    print(f"\nYou chose {item}, computer chose {computer_action}.\n")


    if item == computer_action:
        print(f"Both players selected {item}. It's a tie!")
        scoreUpdate(score)
    elif item == "rock":
        if computer_action == "scissors":
            print("💎 beats ✂ ! You win!")
            score += 1
            scoreUpdate(score)
        else:
            print("📃 covers 💎! You lose.")
            score -= 1
            scoreUpdate(score)
    elif item == "paper":
        if computer_action == "rock":
            print("📃 covers 💎! You win!")
            score += 1
            scoreUpdate(score)
        else:
            print("✂  cuts 📃! You lose.")
            score -= 1
            scoreUpdate(score)
    elif item == "scissors":
        if computer_action == "paper":
            print("✂  cuts 📃! You win!")
            score += 1
            scoreUpdate(score)
        else:
            print("💎 smashes ✂ ! You lose.")
            score -= 1
            scoreUpdate(score)