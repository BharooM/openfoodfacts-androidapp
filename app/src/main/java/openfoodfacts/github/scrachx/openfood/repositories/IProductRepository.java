
package openfoodfacts.github.scrachx.openfood.repositories;

import java.util.List;

import io.reactivex.Single;
import openfoodfacts.github.scrachx.openfood.models.Additive;
import openfoodfacts.github.scrachx.openfood.models.AdditiveName;
import openfoodfacts.github.scrachx.openfood.models.Allergen;
import openfoodfacts.github.scrachx.openfood.models.AllergenName;
import openfoodfacts.github.scrachx.openfood.models.AnalysisTag;
import openfoodfacts.github.scrachx.openfood.models.AnalysisTagConfig;
import openfoodfacts.github.scrachx.openfood.models.Category;
import openfoodfacts.github.scrachx.openfood.models.CategoryName;
import openfoodfacts.github.scrachx.openfood.models.Country;
import openfoodfacts.github.scrachx.openfood.models.CountryName;
import openfoodfacts.github.scrachx.openfood.models.Ingredient;
import openfoodfacts.github.scrachx.openfood.models.InsightAnnotationResponse;
import openfoodfacts.github.scrachx.openfood.models.Label;
import openfoodfacts.github.scrachx.openfood.models.LabelName;
import openfoodfacts.github.scrachx.openfood.models.Question;
import openfoodfacts.github.scrachx.openfood.models.Tag;

/**
 * This is a repository class working as an Interface.
 * It defines all the functions in Repository component.
 *
 * @author Lobster
 * @since 03.03.18
 */
public interface IProductRepository {

    Single<List<Label>> getLabels(boolean checkUpdate);

    Single<List<Allergen>> getAllergens(boolean checkUpdate);

    Single<List<Tag>> getTags(boolean refresh);

    Single<List<Additive>> getAdditives(boolean checkUpdate);

    Single<List<Country>> getCountries(boolean checkUpdate);

    Single<List<Category>> getCategories(boolean checkUpdate);

    Single<List<Ingredient>> getIngredients(boolean checkUpdate);

    void saveLabels(List<Label> labels);

    void saveTags(List<Tag> tags);

    void saveAdditives(List<Additive> additives);

    void saveCountries(List<Country> countries);

    void saveAllergens(List<Allergen> allergens);

    void saveAnalysisTags(List<AnalysisTag> analysisTags);

    void saveAnalysisTagConfigs(List<AnalysisTagConfig> analysisTagConfigs);

    void saveCategories(List<Category> categories);

    void saveIngredients(List<Ingredient> ingredients);

    void saveIngredient(Ingredient ingredient);

    void setAllergenEnabled(String allergenTag, Boolean isEnabled);

    Single<LabelName> getLabelByTagAndLanguageCode(String labelTag, String languageCode);

    Single<LabelName> getLabelByTagAndDefaultLanguageCode(String labelTag);

    Single<CountryName> getCountryByTagAndLanguageCode(String labelTag, String languageCode);

    Single<CountryName> getCountryByTagAndDefaultLanguageCode(String labelTag);

    Single<AdditiveName> getAdditiveByTagAndLanguageCode(String additiveTag, String languageCode);

    Single<AdditiveName> getAdditiveByTagAndDefaultLanguageCode(String additiveTag);

    Single<CategoryName> getCategoryByTagAndLanguageCode(String categoryTag, String languageCode);

    Single<CategoryName> getCategoryByTagAndDefaultLanguageCode(String categoryTag);

    Single<List<CategoryName>> getAllCategoriesByLanguageCode(String languageCode);

    Single<List<CategoryName>> getAllCategoriesByDefaultLanguageCode();

    List<Allergen> getEnabledAllergens();

    Single<List<AllergenName>> getAllergensByEnabledAndLanguageCode(Boolean isEnabled, String languageCode);

    Single<List<AllergenName>> getAllergensByLanguageCode(String languageCode);

    Single<AllergenName> getAllergenByTagAndLanguageCode(String allergenTag, String languageCode);

    Single<AllergenName> getAllergenByTagAndDefaultLanguageCode(String allergenTag);

    Boolean additivesIsEmpty();

    Single<Question> getSingleProductQuestion(String code, String lang);

    Single<InsightAnnotationResponse> annotateInsight(String insightId, int annotation);

    Single<List<AnalysisTag>> getAnalysisTags(boolean refresh);

    Single<List<AnalysisTagConfig>> getAnalysisTagConfigs(boolean refresh);

    Single<AnalysisTagConfig> getAnalysisTagConfigByTagAndLanguageCode(String analysisTag, String languageCode);
}
