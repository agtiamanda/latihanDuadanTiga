package com.example.latihanduadantiga

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//kalau merah alt+enter, kalau ga muncul tungguin baru ulangin lagi biar langsung ke solve
@Entity(tableName = "word_table")
class Word (@PrimaryKey @ColumnInfo(name = "word") val word: String) {
}