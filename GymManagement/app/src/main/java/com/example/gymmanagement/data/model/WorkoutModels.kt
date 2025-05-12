package com.example.gymmanagement.data.model

data class WorkoutRequest(
    val eventTitle: String,
    val sets: Int,
    val repsOrSecs: Int,
    val restTime: Int,
    val imageUri: String?,
    val isCompleted: Boolean = false,
    val userId: Int
)

data class WorkoutUpdateRequest(
    val id: Int,
    val eventTitle: String? = null,
    val sets: Int? = null,
    val repsOrSecs: Int? = null,
    val restTime: Int? = null,
    val userId: Int? = null
)

data class WorkoutResponse(
    val id: Int,
    val eventTitle: String,
    val sets: Int,
    val repsOrSecs: Int,
    val restTime: Int,
    val imageUri: String?,
    val isCompleted: Boolean,
    val createdAt: String,
    val updatedAt: String,
    val userId: Int
)

data class WorkoutStatsResponse(
    val totalWorkouts: Int,
    val completedWorkouts: Int,
    val averageSets: Double,
    val averageReps: Double
)

data class UserProgressResponse(
    val userId: Int,
    val name: String,
    val email: String,
    val totalWorkouts: Int,
    val completedWorkouts: Int,
    val progressPercentage: Int
) 