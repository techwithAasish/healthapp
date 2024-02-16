
package com.example.healthconnect.codelab.presentation.component

import androidx.annotation.StringRes
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.healthconnect.codelab.R
import com.example.healthconnect.codelab.presentation.theme.HealthConnectTheme


fun LazyListScope.sessionDetailsItem(
  @StringRes labelId: Int,
  content: @Composable () -> Unit,
) {
  item {
    Text(
      text = stringResource(id = labelId),
      style = MaterialTheme.typography.h5,
      color = MaterialTheme.colors.primary
    )
    content()
  }
}

@Preview
@Composable
fun SessionDetailsItemPreview() {
  HealthConnectTheme {
    LazyColumn {
      sessionDetailsItem(R.string.total_steps) {
        Text(text = "12345")
      }
    }
  }
}
