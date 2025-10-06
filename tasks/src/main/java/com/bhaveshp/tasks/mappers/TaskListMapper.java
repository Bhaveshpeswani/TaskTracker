package com.bhaveshp.tasks.mappers;

import com.bhaveshp.tasks.domain.dto.TaskListDto;
import com.bhaveshp.tasks.domain.entities.TaskList;

public interface TaskListMapper {

     TaskList fromDto(TaskListDto taskListDto);

     TaskListDto toDto(TaskList taskList);
}
