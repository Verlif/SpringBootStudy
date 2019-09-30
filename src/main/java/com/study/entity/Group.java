package com.study.entity;

public class Group extends JSONBuilder {

    public static final String ID_DEFAULT = "default";

    private String groupId;     // 分组id
    private String groupName;   // 分组名称
    private String notes;       // 备注

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
