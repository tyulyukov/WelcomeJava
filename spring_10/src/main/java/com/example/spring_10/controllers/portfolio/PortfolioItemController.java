package com.example.spring_10.controllers.portfolio;

import com.example.spring_10.models.portfolio.PortfolioItem;
import com.example.spring_10.models.portfolio.PortfolioTag;
import com.example.spring_10.repos.portfolio.PortfolioCategoryRepository;
import com.example.spring_10.repos.portfolio.PortfolioItemRepository;
import com.example.spring_10.repos.portfolio.PortfolioTagsRepository;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashSet;

@Controller
public class PortfolioItemController {
    private final PortfolioItemRepository portfolioItemRepository;
    private final PortfolioCategoryRepository portfolioCategoryRepository;
    private final PortfolioTagsRepository portfolioTagsRepository;

    public PortfolioItemController(PortfolioItemRepository portfolioItemRepository, PortfolioCategoryRepository portfolioCategoryRepository, PortfolioTagsRepository portfolioTagsRepository) {
        this.portfolioItemRepository = portfolioItemRepository;
        this.portfolioCategoryRepository = portfolioCategoryRepository;
        this.portfolioTagsRepository = portfolioTagsRepository;
    }

    /**
     * Вывод на экран всех портфолио
     * @param model
     * @return
     */
    @GetMapping("/portfolio")
    public String index(Model model) {
        model.addAttribute("portfolios", portfolioItemRepository.findAll());
        return "portfolio/index";
    }

    /**
     * Вывод формы для создания новой сущности
     * @return
     */
    @GetMapping("/portfolio/create")
    public String create(Model model) {
        model.addAttribute("categories", portfolioCategoryRepository.findAll());
        model.addAttribute("tags", portfolioTagsRepository.findAll());
        return "/portfolio/form-create";
    }

    /**
     * Сохранение сущности
     * @param portfolio
     */
    @PostMapping("/portfolio/store")
    public RedirectView store(@Param("category_id") long category_id, @Param("tags_id") long[] tags_id, PortfolioItem portfolio) {
        portfolio.setPortfolioCategory(portfolioCategoryRepository.findById(category_id).get());

        var tags = new HashSet<PortfolioTag>();
        for(int i = 1; i < tags_id.length; i++) {
            tags.add(portfolioTagsRepository.findById(tags_id[i]).get());
        }

        portfolio.setPortfolioTags(tags);

        portfolioItemRepository.save(portfolio);
        return new RedirectView("/portfolio");
    }

    @GetMapping("/portfolio/edit/{id}")
    public String edit(Model model, @PathVariable(name="id") Long id) {
        PortfolioItem p = portfolioItemRepository.findById(id).get();
        model.addAttribute("portfolio", p);
        return "/portfolio/form-update";
    }

    @GetMapping("/portfolio/delete/{id}")
    public RedirectView delete(@PathVariable(name="id") Long id) {
        portfolioItemRepository.deleteById(id);
        return new RedirectView("/portfolio");
    }
}
