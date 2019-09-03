package com.aperolabs.javahotelsffunc.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Payload {
    @JsonProperty("Guest_Authenticated_ID_c")
    private String guestAuthenticatedId;

    @JsonProperty("Status_c")
    private String statusC;

    @JsonProperty("Room_Number_c")
    private String roomNumberC;
}
