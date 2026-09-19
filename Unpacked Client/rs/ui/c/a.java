/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pushingpixels.substance.api.ComponentState
 *  org.pushingpixels.substance.api.SubstanceColorSchemeBundle
 *  org.pushingpixels.substance.api.SubstanceSkin
 *  org.pushingpixels.substance.api.SubstanceSkin$ColorSchemes
 *  org.pushingpixels.substance.api.SubstanceSlices$ColorSchemeAssociationKind
 *  org.pushingpixels.substance.api.SubstanceSlices$DecorationAreaType
 *  org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery
 *  org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme
 *  org.pushingpixels.substance.api.painter.border.ClassicBorderPainter
 *  org.pushingpixels.substance.api.painter.border.CompositeBorderPainter
 *  org.pushingpixels.substance.api.painter.border.DelegateBorderPainter
 *  org.pushingpixels.substance.api.painter.border.StandardBorderPainter
 *  org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter
 *  org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter
 *  org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter
 *  org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter
 *  org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter
 *  org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter
 *  org.pushingpixels.substance.api.painter.overlay.SubstanceOverlayPainter
 *  org.pushingpixels.substance.api.painter.overlay.TopBezelOverlayPainter
 *  org.pushingpixels.substance.api.painter.overlay.TopLineOverlayPainter
 *  org.pushingpixels.substance.internal.utils.SubstanceColorUtilities
 */
package rs.ui.c;

import java.awt.Color;
import java.net.URL;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.painter.border.StandardBorderPainter;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.SubstanceOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import rs.ui.c.b;

public class a
extends SubstanceSkin {
    private static final String a = "RuneLite";

    a() {
        SubstanceSkin.ColorSchemes colorSchemes = SubstanceSkin.getColorSchemes((URL)((Object)((Object)this)).getClass().getResource("RuneLite.colorschemes"));
        SubstanceColorScheme substanceColorScheme2 = colorSchemes.get("RuneLite Active");
        SubstanceColorScheme substanceColorScheme3 = colorSchemes.get("RuneLite Enabled");
        SubstanceColorSchemeBundle substanceColorSchemeBundle = new SubstanceColorSchemeBundle(substanceColorScheme2, substanceColorScheme3, substanceColorScheme3);
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme3, 0.6f, new ComponentState[]{ComponentState.DISABLED_UNSELECTED});
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme2, 0.6f, new ComponentState[]{ComponentState.DISABLED_SELECTED});
        substanceColorSchemeBundle.registerHighlightColorScheme(colorSchemes.get("RuneLite Highlight"), new ComponentState[]{ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_UNSELECTED});
        SubstanceColorScheme substanceColorScheme4 = colorSchemes.get("RuneLite Selected Disabled Border");
        SubstanceColorScheme substanceColorScheme5 = colorSchemes.get("RuneLite Border");
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme4, SubstanceSlices.ColorSchemeAssociationKind.BORDER, new ComponentState[]{ComponentState.DISABLED_SELECTED});
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme5, SubstanceSlices.ColorSchemeAssociationKind.BORDER, new ComponentState[0]);
        SubstanceColorScheme substanceColorScheme6 = colorSchemes.get("RuneLite Mark Active");
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme6, SubstanceSlices.ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme6, 0.6f, SubstanceSlices.ColorSchemeAssociationKind.MARK, new ComponentState[]{ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED});
        SubstanceColorScheme substanceColorScheme7 = colorSchemes.get("RuneLite Separator");
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme7, SubstanceSlices.ColorSchemeAssociationKind.SEPARATOR, new ComponentState[0]);
        substanceColorSchemeBundle.registerColorScheme(colorSchemes.get("RuneLite Tab Border"), SubstanceSlices.ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());
        SubstanceColorScheme substanceColorScheme8 = colorSchemes.get("RuneLite Watermark");
        this.registerDecorationAreaSchemeBundle(substanceColorSchemeBundle, substanceColorScheme8, new SubstanceSlices.DecorationAreaType[]{SubstanceSlices.DecorationAreaType.NONE});
        SubstanceColorSchemeBundle substanceColorSchemeBundle2 = new SubstanceColorSchemeBundle(substanceColorScheme2, substanceColorScheme3, substanceColorScheme3);
        substanceColorSchemeBundle2.registerColorScheme(substanceColorScheme3, 0.5f, new ComponentState[]{ComponentState.DISABLED_UNSELECTED});
        substanceColorSchemeBundle2.registerColorScheme(substanceColorScheme4, SubstanceSlices.ColorSchemeAssociationKind.BORDER, new ComponentState[]{ComponentState.DISABLED_SELECTED});
        substanceColorSchemeBundle2.registerColorScheme(substanceColorScheme5, SubstanceSlices.ColorSchemeAssociationKind.BORDER, new ComponentState[0]);
        substanceColorSchemeBundle2.registerColorScheme(substanceColorScheme6, SubstanceSlices.ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
        SubstanceColorScheme substanceColorScheme9 = colorSchemes.get("RuneLite Decorations Separator");
        substanceColorSchemeBundle2.registerColorScheme(substanceColorScheme9, SubstanceSlices.ColorSchemeAssociationKind.SEPARATOR, new ComponentState[0]);
        SubstanceColorScheme substanceColorScheme10 = colorSchemes.get("RuneLite Decorations Watermark");
        this.registerDecorationAreaSchemeBundle(substanceColorSchemeBundle2, substanceColorScheme10, new SubstanceSlices.DecorationAreaType[]{SubstanceSlices.DecorationAreaType.TOOLBAR, SubstanceSlices.DecorationAreaType.GENERAL, SubstanceSlices.DecorationAreaType.FOOTER});
        SubstanceColorSchemeBundle substanceColorSchemeBundle3 = new SubstanceColorSchemeBundle(substanceColorScheme2, substanceColorScheme3, substanceColorScheme3);
        substanceColorSchemeBundle3.registerColorScheme(substanceColorScheme3, 0.5f, new ComponentState[]{ComponentState.DISABLED_UNSELECTED});
        SubstanceColorScheme substanceColorScheme11 = colorSchemes.get("RuneLite Header Border");
        substanceColorSchemeBundle3.registerColorScheme(substanceColorScheme4, SubstanceSlices.ColorSchemeAssociationKind.BORDER, new ComponentState[]{ComponentState.DISABLED_SELECTED});
        substanceColorSchemeBundle3.registerColorScheme(substanceColorScheme11, SubstanceSlices.ColorSchemeAssociationKind.BORDER, new ComponentState[0]);
        substanceColorSchemeBundle3.registerColorScheme(substanceColorScheme6, SubstanceSlices.ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
        substanceColorSchemeBundle3.registerHighlightColorScheme(substanceColorScheme2, 0.7f, new ComponentState[]{ComponentState.ROLLOVER_UNSELECTED, ComponentState.ROLLOVER_ARMED, ComponentState.ARMED});
        substanceColorSchemeBundle3.registerHighlightColorScheme(substanceColorScheme2, 0.8f, new ComponentState[]{ComponentState.SELECTED});
        substanceColorSchemeBundle3.registerHighlightColorScheme(substanceColorScheme2, 1.0f, new ComponentState[]{ComponentState.ROLLOVER_SELECTED});
        SubstanceColorScheme substanceColorScheme12 = colorSchemes.get("RuneLite Header Watermark");
        this.registerDecorationAreaSchemeBundle(substanceColorSchemeBundle3, substanceColorScheme12, new SubstanceSlices.DecorationAreaType[]{SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE, SubstanceSlices.DecorationAreaType.SECONDARY_TITLE_PANE, SubstanceSlices.DecorationAreaType.HEADER});
        this.setTabFadeStart(0.2);
        this.setTabFadeEnd(0.9);
        this.addOverlayPainter((SubstanceOverlayPainter)BottomShadowOverlayPainter.getInstance(), new SubstanceSlices.DecorationAreaType[]{SubstanceSlices.DecorationAreaType.TOOLBAR});
        this.addOverlayPainter((SubstanceOverlayPainter)BottomShadowOverlayPainter.getInstance(), new SubstanceSlices.DecorationAreaType[]{SubstanceSlices.DecorationAreaType.FOOTER});
        BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(substanceColorScheme -> substanceColorScheme.getUltraDarkColor().darker());
        this.addOverlayPainter((SubstanceOverlayPainter)bottomLineOverlayPainter, new SubstanceSlices.DecorationAreaType[]{SubstanceSlices.DecorationAreaType.TOOLBAR});
        TopLineOverlayPainter topLineOverlayPainter = new TopLineOverlayPainter(substanceColorScheme -> SubstanceColorUtilities.getAlphaColor((Color)substanceColorScheme.getForegroundColor(), (int)32));
        this.addOverlayPainter((SubstanceOverlayPainter)topLineOverlayPainter, new SubstanceSlices.DecorationAreaType[]{SubstanceSlices.DecorationAreaType.TOOLBAR});
        TopBezelOverlayPainter topBezelOverlayPainter = new TopBezelOverlayPainter(substanceColorScheme -> substanceColorScheme.getUltraDarkColor().darker(), substanceColorScheme -> SubstanceColorUtilities.getAlphaColor((Color)substanceColorScheme.getForegroundColor(), (int)32));
        this.addOverlayPainter((SubstanceOverlayPainter)topBezelOverlayPainter, new SubstanceSlices.DecorationAreaType[]{SubstanceSlices.DecorationAreaType.FOOTER});
        this.setTabFadeStart(0.18);
        this.setTabFadeEnd(0.18);
        this.buttonShaper = new b(this);
        this.watermark = null;
        this.fillPainter = new FractionBasedFillPainter(a, new float[]{0.0f, 0.5f, 1.0f}, new ColorSchemeSingleColorQuery[]{ColorSchemeSingleColorQuery.ULTRALIGHT, ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.LIGHT});
        this.decorationPainter = new MatteDecorationPainter();
        this.highlightPainter = new ClassicHighlightPainter();
        this.borderPainter = new CompositeBorderPainter(a, (SubstanceBorderPainter)new ClassicBorderPainter(), (SubstanceBorderPainter)new DelegateBorderPainter("RuneLite Inner", (StandardBorderPainter)new ClassicBorderPainter(), 0x40FFFFFF, 0x20FFFFFF, 0xFFFFFF, substanceColorScheme -> substanceColorScheme.tint((double)0.2f)));
    }

    public String getDisplayName() {
        return a;
    }
}

