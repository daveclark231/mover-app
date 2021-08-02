package com.example.mover.model.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mover_table")
data class Mover (
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "first_name")
    var firstName: String,

    @ColumnInfo(name = "last_name")
    var lastName: String,

    @ColumnInfo(name = "address")
    var address: String,

    @ColumnInfo(name = "money_owed")
    var moneyOwed: Double?
)