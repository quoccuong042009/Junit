import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TenisScoringTestCase {


	@Test
	public void testScoringDeuce0x0() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.LOVE);
		score.setPointsForPlayer(2, TennisScore.Points.LOVE);
		assertEquals("deuce", score.printScore());
	}

	@Test
	public void testScoringDeuce1x1() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.FIFTEEN);
		score.setPointsForPlayer(2, TennisScore.Points.FIFTEEN);
		assertEquals("deuce", score.printScore());
	}

	@Test
	public void testScoringDeuce2x2() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.THIRTY);
		score.setPointsForPlayer(2, TennisScore.Points.THIRTY);
		assertEquals("deuce", score.printScore());
	}

	@Test
	public void testScoringDeuce3x3() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.FORTY);
		score.setPointsForPlayer(2, TennisScore.Points.FORTY);
		assertEquals("deuce", score.printScore());
	}
	
	@Test
	public void testScoringAdvantageToOne1x0() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.FIFTEEN);
		score.setPointsForPlayer(2, TennisScore.Points.LOVE);
		assertEquals("advantage to player one", score.printScore());
	}
	
	@Test
	public void testScoringAdvantageToOne2x0() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.THIRTY);
		score.setPointsForPlayer(2, TennisScore.Points.LOVE);
		assertEquals("advantage to player one", score.printScore());
	}

	@Test
	public void testScoringAdvantageToOne3x0() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.FORTY);
		score.setPointsForPlayer(2, TennisScore.Points.LOVE);
		assertEquals("advantage to player one", score.printScore());
	}
	
	@Test
	public void testScoringAdvantageToTwo0x1() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.LOVE);
		score.setPointsForPlayer(2, TennisScore.Points.FIFTEEN);
		assertEquals("advantage to player two", score.printScore());
	}
	
	@Test
	public void testScoringAdvantageToTwo0x2() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.LOVE);
		score.setPointsForPlayer(2, TennisScore.Points.THIRTY);
		assertEquals("advantage to player two", score.printScore());
	}
	
	@Test
	public void testScoringAdvantageToTwo0x3() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.LOVE);
		score.setPointsForPlayer(2, TennisScore.Points.FORTY);
		assertEquals("advantage to player two", score.printScore());
	}
	
	@Test
	public void testScoringAdvantageToTwo1x2() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.FIFTEEN);
		score.setPointsForPlayer(2, TennisScore.Points.THIRTY);
		assertEquals("advantage to player two", score.printScore());
	}
	
	@Test
	public void testScoringAdvantageToTwo2x3() {
		TennisScore score = new TennisScore();
		score.setPointsForPlayer(1, TennisScore.Points.THIRTY);
		score.setPointsForPlayer(2, TennisScore.Points.FORTY);
		assertEquals("advantage to player two", score.printScore());
	}
}
