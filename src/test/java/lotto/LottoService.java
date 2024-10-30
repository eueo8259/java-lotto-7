package lotto;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import lotto.constant.LottoConstant;

public class LottoService {
    public Lotto createLotto(){
        return new Lotto(createLottoNumbers());
    }

    private List<Integer> createLottoNumbers(){
        return Randoms.pickUniqueNumbersInRange(
                LottoConstant.LOTTO_NUMBER_MIN,
                LottoConstant.LOTTO_NUMBER_MAX,
                LottoConstant.LOTTO_NUMBER_SIZE);

    }

}
