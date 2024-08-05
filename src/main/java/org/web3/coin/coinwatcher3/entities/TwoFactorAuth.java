package org.web3.coin.coinwatcher3.entities;
import lombok.Data;
import org.web3.coin.coinwatcher3.domain.VerificationType;
@Data
public class TwoFactorAuth {
    private boolean isEnabled= false;
    private VerificationType sendTo;
}
