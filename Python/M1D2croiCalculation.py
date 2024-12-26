
# Input from user
investment = float(input("Enter the investment amount: "))
net_profit = float(input("Enter the net profit: "))

# Calculate ROI
roi = (net_profit / investment) * 100

# Display result
if roi > 0:
    print(f"ROI is {roi:.2f}%. It's a profit!")
else:
    print(f"ROI is {roi:.2f}%. It's a loss!")



