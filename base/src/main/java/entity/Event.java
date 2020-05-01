package entity;

import javax.persistence.*;

/**
 * @author meet.patel
 * @date 5/1/2020
 **/
@Entity
@Table
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String date;
}
