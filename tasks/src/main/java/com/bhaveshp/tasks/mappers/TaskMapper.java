package com.bhaveshp.tasks.mappers;

import com.bhaveshp.tasks.domain.dto.TaskDto;
import com.bhaveshp.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
