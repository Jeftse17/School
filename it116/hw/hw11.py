import random
def create_deck(suits, values):
    deck = []
    for suit in suits:
        for value in values:
            deck.append(Card(suit, value))
    return deck

def shuffle(deck):
    random.shuffle(deck)
    return deck

def deal_hand(deck):
    hand = []
    for card in deck:
        hand.append(card)
    return hand


#? Test Code ?#
random.seed(79)
suits = ["Spades", "Hearts", "Diamonds", "Clubs"]
values = ["Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"]
deck  = create_deck(suits, values)
deck  = shuffle(deck)
print(deal_hand(deck))
print(deal_hand(deck))