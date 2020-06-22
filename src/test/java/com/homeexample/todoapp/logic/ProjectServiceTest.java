package com.homeexample.todoapp.logic;

import com.homeexample.todoapp.model.TaskGroupRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class ProjectServiceTest {

    @Test
    @DisplayName("should throw IllegalStateException when configured to allow just 1 group and the other unDone group")
    void createGroup_noMultipleGroupConfig_And_openGroups_throwsIllegalStateException() {
        //given
        var mockGroupRepository = mock(TaskGroupRepository.class);

        //when
        //then

    }
}