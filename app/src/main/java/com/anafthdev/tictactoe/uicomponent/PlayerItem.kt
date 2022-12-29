package com.anafthdev.tictactoe.uicomponent

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.anafthdev.tictactoe.R
import com.anafthdev.tictactoe.data.PointType
import com.anafthdev.tictactoe.model.Player

@Composable
fun PlayerItem(
	player: Player,
	modifier: Modifier = Modifier
) {

	Column(
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Card(modifier = modifier) {
			Column(
				horizontalAlignment = Alignment.CenterHorizontally,
				modifier = Modifier
					.padding(16.dp)
			) {
				Text(
					text = player.name,
					style = MaterialTheme.typography.bodySmall.copy(
						fontWeight = FontWeight.Bold
					)
				)
				
				Spacer(modifier = Modifier.height(16.dp))
				
				Surface(
					shape = MaterialTheme.shapes.large,
					color = MaterialTheme.colorScheme.background
				) {
					Image(
						painter = painterResource(
							id = when (player.pointType) {
								PointType.Empty -> R.drawable.transparent
								PointType.X -> R.drawable.ic_tic_tac_toe_x
								PointType.O -> R.drawable.ic_tic_tac_toe_o
							}
						),
						contentDescription = null,
						modifier = Modifier
							.padding(
								horizontal = 12.dp,
								vertical = 4.dp
							)
							.size(24.dp)
					)
				}
			}
		}
		
		Spacer(modifier = Modifier.height(8.dp))
		
		Card(
			shape = CircleShape,
			border = BorderStroke(
				width = 1.dp,
				color = MaterialTheme.colorScheme.onSurfaceVariant
			)
		) {
			Text(
				text = "Win rounds: ${player.win}",
				style = MaterialTheme.typography.labelMedium.copy(
					fontWeight = FontWeight.Medium,
					color = MaterialTheme.colorScheme.tertiary
				),
				modifier = Modifier
					.padding(
						horizontal = 8.dp,
						vertical = 4.dp
					)
			)
		}
	}
}