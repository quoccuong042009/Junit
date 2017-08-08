public class TennisScore {
	enum Points {
		LOVE(0), FIFTEEN(1), THIRTY(2), FORTY(3);

		private int value;

		private Points(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	private Points playerOnePoints;
	private Points playerTwoPoints;

	public void setPointsForPlayer(int player, Points points) {
		if (player == 1) {
			this.playerOnePoints = points;
		} else {
			this.playerTwoPoints = points;
		}
	}

	public String printScore() {
		if (this.playerOnePoints.getValue() > this.playerTwoPoints.getValue()) {
			return "advantage to player one";
		} else if (this.playerOnePoints.getValue() < this.playerTwoPoints.getValue()) {
			return "advantage to player two";
		}
		return "deuce";
	}

}

