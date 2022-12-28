package com.anafthdev.tictactoe.model

import com.anafthdev.tictactoe.data.PointType

data class Player(
	val id: Int,
	val name: String,
	var pointType: PointType
) {
	companion object {
		val Player1 = Player(
			id = 0,
			name = "Player 1",
			pointType = PointType.X
		)
		
		val Player2 = Player(
			id = 1,
			name = "Player 2",
			pointType = PointType.O
		)
	}
}