package br.ufs.nubankchallenge.core.domain.chargeback

import br.ufs.nubankchallenge.core.domain.chargeback.models.ChargebackReclaim
import io.reactivex.Observable

/**
 *
 * Created by @ubiratanfsoares
 *
 */

interface SubmitNewChargeback {

    fun newReclaim(reclaim: ChargebackReclaim) : Observable<Unit>

}