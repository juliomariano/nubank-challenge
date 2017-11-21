package br.ufs.nubankchallenge.core.infrastructure.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by @ubiratanfsoares
 */

public class SubmitChargebackBody {

    public String comment;
    @SerializedName("reason_details") public List<ReasonDetailBody> details;

    static class ReasonDetailBody {
        public String id;
        public boolean response;
    }

}