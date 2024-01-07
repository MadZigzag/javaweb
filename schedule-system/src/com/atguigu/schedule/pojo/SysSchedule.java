package com.atguigu.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: SysSchedule
 * Package: com.atguigu.schedule.pojo
 * Description:
 *
 * @author sichen
 * @version 1.0
 * @create 1/4/24 8:52 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data

public class SysSchedule implements Serializable {
    private Integer sid;
    private Integer uid;
    private String title;
    private Integer completed;
}
