package lesson38.ClassWork.controller.rest;

import lesson38.ClassWork.security.dto.AuthorizedUser;
import lesson38.ClassWork.security.jwt.JwtHelper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class JwtController {

    private final JwtHelper jwtHelper;

    @PostMapping("/jwt")
    public String jwt(@RequestParam String login, @RequestParam String right) {
        return jwtHelper.generateToken("me", login, new String[]{right});
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/secured/jwt")
    public String securedJwt() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof PreAuthenticatedAuthenticationToken authToken
             && authToken.getPrincipal() instanceof AuthorizedUser authorizedUser) {
            log.info("Вход в систему был осуществлен {}", authorizedUser);
            return authorizedUser.getLogin();
        }
        return "NoUser";
    }
}
