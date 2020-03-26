package chess.domain.piece;

import chess.domain.Side;
import chess.domain.position.Position;

public class Queen extends Piece {
	public Queen(Side side, Position position) {
		super(side, position);
	}

	@Override
	public boolean isInPath(Position targetPosition) {
		return position.isLinear(targetPosition);
	}
}